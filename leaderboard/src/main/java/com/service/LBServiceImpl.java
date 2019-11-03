package com.service;

import com.dao.ITeamDao;
import com.entity.LeaderBoard;
import com.entity.Team;
import com.request.GetLBSnapshotRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LBServiceImpl implements ILBService {

    @Autowired
    private ITeamDao teamDao;

    @Override
    public List<Team> getLBSnapshot(GetLBSnapshotRequest request) {

        PageRequest pageable  = PageRequest.of(request.getPageNumber() - 1, request.getPageSize());
        List<Team> teams = teamDao.getLeaderBoardSnapshot(request.getMatchId());
        return teams;
    }
}

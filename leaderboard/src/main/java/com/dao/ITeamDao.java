package com.dao;

import com.entity.Team;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeamDao extends PagingAndSortingRepository<Team, Integer> {

    List<Team> findByMatchId(int matchId);

    @Query(value = "SELECT *, rank() " +
            "over ( PARTITION BY t.match_id ORDER BY t.total_score DESC) rank " +
            "FROM TEAM t where t.match_id = :matchId ", nativeQuery = true)
    List<Team> getLeaderBoardSnapshot(@Param("matchId") int matchId);
}

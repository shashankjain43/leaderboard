package com.service;

import com.entity.Team;
import com.request.GetLBSnapshotRequest;

import java.util.List;

public interface ILBService {

    List<Team> getLBSnapshot(GetLBSnapshotRequest request);
}

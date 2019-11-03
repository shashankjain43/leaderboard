package com.response;

import com.entity.LeaderBoard;
import com.entity.Team;
import lombok.Data;

import java.util.List;

@Data
public class GetLBSnapshotResponse extends BaseResponse {
    List<Team> snapshot;
}

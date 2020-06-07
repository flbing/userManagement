package com.user.management.com.user.mapper;

import com.user.management.com.user.domain.TrxApplyInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TrxApplyInfoMapper {




        List<TrxApplyInfo> getAll();

    TrxApplyInfo getOne(Long applyId);

        void insert(TrxApplyInfo trxApplyInfo);

        void update(TrxApplyInfo trxApplyInfo);

        void delete(Long applyId);


}

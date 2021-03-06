package com.sola.github.domain.repository.repository;

import com.sola.github.domain.params.params.bbs.BBSDataDTO;
import com.sola.github.domain.params.params.bbs.BBSPostsMainReplyDTO;

import java.util.Collection;

import rx.Observable;

/**
 * Created by Sola
 * 2016/12/19.
 */
public interface BBSRepository {
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    /**
     * @param sectionId 页码
     * @param pageNo    分页的Index
     * @param pageSize  分页的总数
     * @return 返回数据处理队列
     */
    Observable<Collection<BBSDataDTO>> requestBBSList(int sectionId, int pageNo, int pageSize);

    Observable<Collection<BBSPostsMainReplyDTO>> requestBBSPostsList(int postsId);
}

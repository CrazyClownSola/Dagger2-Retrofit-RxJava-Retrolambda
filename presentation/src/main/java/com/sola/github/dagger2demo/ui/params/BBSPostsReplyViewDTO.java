package com.sola.github.dagger2demo.ui.params;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sola.github.dagger2demo.R;
import com.sola.github.domain.params.params.bbs.BBSPostsMainReplyDTO;
import com.sola.github.tools.delegate.IRecyclerViewClickDelegate;
import com.sola.github.tools.utils.TypeBuilder;

/**
 * Created by Sola
 * 2016/12/20.
 * 帖子的回复数据结构
 */
@SuppressWarnings("unused")
class BBSPostsReplyViewDTO extends BaseViewDTO<BBSPostsMainReplyDTO> implements IRecyclerViewClickDelegate {

    // ===========================================================
    // Constants
    // ===========================================================

    private static final int NORMAL_VIEW_TYPE = TypeBuilder.getInstance().generateId();
    private static final int EXPEND_VIEW_TYPE = TypeBuilder.getInstance().generateId();

    // ===========================================================
    // Fields
    // ===========================================================

    private int viewType;

    // ===========================================================
    // Constructors
    // ===========================================================

    public BBSPostsReplyViewDTO(BBSPostsMainReplyDTO data) {
        super(data);
        viewType = NORMAL_VIEW_TYPE;
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    @Override
    public void itemClick(View v) {

    }

    @Override
    public RecyclerView.ViewHolder getHolder(Context context, ViewGroup parent, int viewType) {
        if (viewType == NORMAL_VIEW_TYPE) {
            return new ViewHolder(
                    LayoutInflater.from(context).inflate(
                            R.layout.recycler_item_bbs_posts_peply_normal_view, parent, false));
        } else if (viewType == EXPEND_VIEW_TYPE) {
            return new ExpendViewHolder(
                    LayoutInflater.from(context).inflate(
                            R.layout.recycler_item_bbs_posts_reply_expend_view, parent, false));
        }
        return null;
    }

    @Override
    public void refreshView(Context context, RecyclerView.ViewHolder holder, int position) {
        if (viewType == NORMAL_VIEW_TYPE) {
            ViewHolder viewHolder = (ViewHolder) holder;

        } else if (viewType == EXPEND_VIEW_TYPE) {
            ExpendViewHolder viewHolder = (ExpendViewHolder) holder;

        }
    }

    @Override
    public int getViewType(int position) {
        return viewType;
    }

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

    class ExpendViewHolder extends ViewHolder {

        TextView id_btn_quick_reply;

        ViewGroup id_include_reply_items;

        ExpendViewHolder(View itemView) {
            super(itemView);
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView id_image_user_photo;

        TextView id_text_bbs_user_name;

        TextView id_text_bbs_description;

        ViewHolder(View itemView) {
            super(itemView);
        }
    }
}

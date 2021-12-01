package com.example.listviewhomework_jaewhi.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listviewhomework_jaewhi.datas.Friend

class FriendAdapter (
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Friend> ) : ArrayAdapter<Friend>(mContext, resId, mList) {
}
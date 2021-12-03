package com.example.listviewhomework_jaewhi.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listviewhomework_jaewhi.R
import com.example.listviewhomework_jaewhi.datas.Friend

class FriendAdapter (
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Friend> ) : ArrayAdapter<Friend>(mContext, resId, mList) {

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        return super.getView(position, convertView, parent)

        var tempRow = convertView
        if (tempRow == null){

            tempRow = inf.inflate(R.layout.friend_list_item,null)

        }

        val row = tempRow!!

        val friendData = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val genderTxt = row.findViewById<TextView>(R.id.genderTxt)
        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearTxt)
        val phoneNumTxt = row.findViewById<TextView>(R.id.phoneNumTxt)

        val koreanAge = 2021 - friendData.birthYear + 1

        nameTxt.text = friendData.name
        genderTxt.text = friendData.gender
        birthYearTxt.text = "${koreanAge}세"
        phoneNumTxt.text = friendData.PhoneNum

        return  row


    }

}
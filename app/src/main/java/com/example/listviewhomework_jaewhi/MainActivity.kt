package com.example.listviewhomework_jaewhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewhomework_jaewhi.adapters.FriendAdapter
import com.example.listviewhomework_jaewhi.datas.Friend
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mFriendList = ArrayList<Friend>()

    lateinit var mAdapter : FriendAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        실제 뿌려줄 데이터 ArrayList에 담아주기
        mFriendList.add(Friend("조민재","남",1996,"010-1234-5678"))
        mFriendList.add(Friend("이서환","남",1994,"010-8765-4321"))
        mFriendList.add(Friend("박태현","남",1999,"010-1357-2468"))
        mFriendList.add(Friend("정병국","남",1990,"010-1111-2222"))

        mAdapter = FriendAdapter(this, R.layout.friend_list_item,mFriendList)

        friendListView.adapter = mAdapter

    }
}
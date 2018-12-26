package com.hugo.Many

fun main(args: Array<String>) {
    var list = listOf(10, 9, 8, 5, 4, 3, 2, 1);
    println(list);
    for( li in list)
    {
        println(li);
    }

    var mlist = mutableListOf(10, 9, 8, 7, 6);
    mlist.add(2, 2);
    println(mlist);
}
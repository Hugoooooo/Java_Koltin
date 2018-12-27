package com.hugo.Box.kotlin

import java.util.*

fun main(args: Array<String>) {
//        Box3: 長23，寬14，高13 (cm)
//        Box5: 長39.5，寬27.5，高23 (cm)
    var length: Float;
    var width: Float;
    var height: Float;
    var scanner = Scanner(System.`in`);
    print("Please enter object\'s length:");
    length = scanner.nextFloat();
    print("Please enter object\'s width:");
    width = scanner.nextFloat();
    print("Please enter object\'s height:");
    height = scanner.nextFloat();

    println(if (Box3().validate(length, width, height)) "Box3 可以容納" else "Box3 不可容納")
    println(if (Box5().validate(length, width, height)) "Box5 可以容納" else "Box5 不可容納")
}

open class BoxModel() {
    var length: Float = 0.0f;
    var width: Float = 0.0f;
    var height: Float = 0.0f;

    fun validate(inputLength: Float, inputWidth: Float, inputHeight: Float): Boolean =
        if (inputLength > this.length || inputWidth > this.width || inputHeight > this.height) false else true;
}


class Box3 : BoxModel() {
    init {
        length = 23f
        width = 14f
        height = 13f
    }

}

class Box5 : BoxModel() {
    init {
        length = 39.5f
        width = 27.5f
        height = 23f
    }
}


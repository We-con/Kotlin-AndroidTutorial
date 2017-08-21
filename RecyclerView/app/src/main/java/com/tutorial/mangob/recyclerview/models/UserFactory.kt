package com.tutorial.mangob.recyclerview.models

/**
 * Created by mangob on 2017. 8. 20..
 */
class UserFactory {

    val users: ArrayList<User>
        get() {
            val result = ArrayList<User>()
            result.add(User("나연", "임", "Korea", "Soeul"))
            result.add(User("지효", "박", "Korea", "Soeul"))
            result.add(User("정연", "유", "Koread", "Souel"))
            result.add(User("모모", "히라이", "Japen", "Tokyo"))
            result.add(User("사나", "미나토자키", "Japen", "Osaka"))
            result.add(User("쯔위", "저우", "China", "Shanghi"))
            return result
        }
}
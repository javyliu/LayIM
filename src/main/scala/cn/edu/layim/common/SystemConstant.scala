package cn.edu.layim.common

/**
  * 系统常量
  */
object SystemConstant {

    final val SUCCESS = 0

    final val ERROR = 1

    final val LOGGIN_SUCCESS = "登陆成功"

    final val LOGGIN_FAIL = "登陆失败"

    final val NONACTIVED = "用户未激活"

    final val REGISTER_SUCCESS = "注册成功"

    final val REGISTER_FAIL = "登陆失败"

    final val SUCCESS_MESSAGE = "操作成功"

    final val ERROR_MESSAGE = "操作失败"

    final val UPLOAD_SUCCESS = "上传成功"

    final val UPLOAD_FAIL = "上传失败"

    final val IMAGE_PATH = "/upload/image/"

    final val FILE_PATH = "/upload/file/"

    final val AVATAR_PATH = "/static/image/avatar/"

    final val GROUP_AVATAR_PATH = "/static/image/group/"

    final val DEFAULT_GROUP_NAME = "我的好友"

    //电子邮件相关
    final val SUBJECT = "LayIM即时通讯系统邮箱激活邮件"

    //Redis Key相关
    final val ONLINE_USER = "ONLINE_USER"

    final val SYSTEM_PAGE = 6

    final val USER_PAGE = 21

    final val ADD_MESSAGE_PAGE = 4

}
package ramizbek.aliyev.todoapp.UserData

data class UserData(
    var titleList: ArrayList<String>,
    var map: HashMap<String, ArrayList<String>>,
    var arrayListData: ArrayList<ForUserData>
)
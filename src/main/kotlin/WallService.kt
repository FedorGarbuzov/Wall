object WallService {
    private var id = 0
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val newPost = post.copy(id = id++)
        posts += newPost
        return newPost
    }

    fun update(post: Post): Boolean {
        val indexOfOld = posts.indexOfFirst { it.id == post.id }
        val old = posts.getOrElse(indexOfOld) { return false }
        posts[indexOfOld] = post.copy(ownerId = old.ownerId, date = old.date)
        return true
    }
}
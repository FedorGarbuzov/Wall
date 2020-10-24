object WallService {
    private var id = 0
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        post.id = id++
        posts += post
        return post
    }

    fun update(post: Post): Boolean {
        posts.forEach {
            if (it.id == post.id) {
                val pos = posts.indexOf(post)
                posts[pos] = Post(id = id++, ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }
}
import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add() {
        val post = Post()
        val post2 = Post()
        WallService.add(post)
        WallService.add(post2)

        val result = post2.id

        assertEquals(0, result)
    }

    @Test
    fun updateTrue() {
        val post = Post()
        WallService.add(post)

        val result = WallService.update(post)

        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        assertFalse(WallService.update(Post()))
    }
}
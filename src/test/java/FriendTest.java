import org.example.Friend;
import org.junit.jupiter.api.*;

public class FriendTest {
    @Test
    void friendToString(){
        Friend newFriend = new Friend(243523, "Gustav");
        String newString = newFriend.toString();
        Assertions.assertEquals("Friend{phoneNumber=243523, contactName='Gustav'}",newString);
    }
}

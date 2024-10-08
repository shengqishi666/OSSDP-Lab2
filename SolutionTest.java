import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class SolutionTest {

    @Test
    public void testRestoreIpAddresses() {
        Solution solution = new Solution();

        // 测试用例 1
        List<String> result1 = solution.restoreIpAddresses("25525511135");
        List<String> expected1 = Arrays.asList("255.255.11.135", "255.255.111.35");
        assertEquals(expected1, result1);

        // 测试用例 2
        List<String> result2 = solution.restoreIpAddresses("0000");
        List<String> expected2 = Collections.singletonList("0.0.0.0");
        assertEquals(expected2, result2);

        // 测试用例 3
        List<String> result3 = solution.restoreIpAddresses("101023");
        List<String> expected3 = Arrays.asList("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        assertEquals(expected3, result3);
    }
}

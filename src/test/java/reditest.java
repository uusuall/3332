import redis.clients.jedis.Jedis;
import redis.clients.jedis.ScanResult;

public class reditest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.252.128", 6379);
        jedis.auth("123456");
        System.out.println(jedis.ping());
        jedis.select(0);
        jedis.set("name", "halo");
        System.out.println(jedis.get("name"));
        jedis.select(2);
        jedis.hset("Student", "name", "king");
        System.out.println(jedis.hget("Student", "name"));
        jedis.select(3);
        jedis.lpush("options","playGame","watchTV","readBook");
        jedis.lpush("options","aa");
        System.out.println(jedis.llen("options"));
        System.out.println("------");
        System.out.println(jedis.lrange("options",0,4));
        System.out.println("------");
        jedis.select(4);
        jedis.sadd("name", "july", "judy", "lucy", "zeus");
        System.out.println(jedis.sscan("name", 2));
    }
}

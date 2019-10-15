package com.yfny.pattern.singleton.example1;

/**
 * Created by jisongZhou on 2019/10/15.
 **/
public class Client {

    public static void main(String[] args) {
        //创建4个 LoadBalancer 对象
        LoadBalancer balancer1, balancer2, balancer3, balancer4;
        balancer1 = LoadBalancer.getLoanBalancer();
        balancer2 = LoadBalancer.getLoanBalancer();
        balancer3 = LoadBalancer.getLoanBalancer();
        balancer4 = LoadBalancer.getLoanBalancer();

        //判断服务器负载均衡器是否相同
        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("服务器负载均衡器具有唯一性！");
        }

        //增加服务器
        balancer1.addServer("Server1");
        balancer1.addServer("Server2");
        balancer1.addServer("Server3");
        balancer1.addServer("Server4");

        //模拟客户端请求的分发，如果输出结果为同一个 server，可以将i适当放大
        //例如改为"i<100"
        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("分发请求至服务器：" + server);
        }

    }

}

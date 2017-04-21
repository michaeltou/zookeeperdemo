package com.tm.zookeeperdemo;

import org.apache.zookeeper.*;

import java.util.List;

/**
 * Created by lenovo on 2017/4/21.
 */
public class Main {

    public static void main(String []args) throws Exception {


        // 创建一个与服务器的连接
        ZooKeeper zk = new ZooKeeper("106.14.98.121:2181,106.14.98.121:2182,106.14.98.121:2183" ,
                1000, new Watcher() {
            // 监控所有被触发的事件
            public void process(WatchedEvent event) {
                System.out.println("");
                System.out.println("已经触发了" + event.getType() + "事件！");
                System.out.println("触发的节点是："+event.getPath());

                System.out.println("事件状态是："+event.getState());
                System.out.println("");
            }
        });

     //   zk.delete("/parent",-1);

        // 创建一个目录节点

   /*    zk.create("/parent", "parentData".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
               CreateMode.PERSISTENT);*/



        // 创建一个子目录节点
  /*  zk.create("/parent/child", "childdata".getBytes(),
          ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.EPHEMERAL);*/

        //System.out.println(new String(zk.getData("/parent",true,null)));
    //    zk.setData("/parent","/modifydata2".getBytes(),-1);

   /*      zk.create("/parent/child", "childdata".getBytes(),
             ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);*/

        //System.out.println(new String(zk.getData("/parent/child",true,null)));
        //zk.setData("/parent/child","/modifydata".getBytes(),-1);

/*        System.out.println(new String(zk.getData("/parent",true,null)));

        zk.create("/root", "root".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT);*/
      //  Stat stat  = zk.exists("/parent",true);
        //zk.setData("/parent","/pdata".getBytes(),-1);


    // List<String> childerns = zk.getChildren("/parent",true);
    //    zk.setData("/parent","/pdata2".getBytes(),-1);
       // zk.create("/parent/child","childdata".getBytes(),  ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
      //  zk.delete("/parent/child",-1);
     //   zk.create("/parent","parentdata".getBytes(),  ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

      /*  zk.create("/parent", "pdata".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);*/
        String createdPath = null;
         createdPath =   zk.create("/parent/child", "cdata".getBytes(),
             ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println("你创建了节点："+createdPath);

        createdPath =    zk.create("/parent/child", "cdata".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println("你创建了节点："+createdPath);

        createdPath =   zk.create("/parent/child", "cdata".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println("你创建了节点："+createdPath);
        createdPath =     zk.create("/parent/child", "cdata".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println("你创建了节点："+createdPath);

        List<String> childerns = zk.getChildren("/parent",true);

        System.out.println("这个父节点有一下子节点："+childerns);
      //  zk.delete("/parent/child",-1);

/*        // 取出子目录节点列表
        System.out.println(zk.getChildren("/testRootPath",true));
        // 修改子目录节点数据
        zk.setData("/testRootPath/testChildPathOne","modifyChildDataOne".getBytes(),-1);
        System.out.println("目录节点状态：["+zk.exists("/testRootPath",true)+"]");
        // 创建另外一个子目录节点
        zk.create("/testRootPath/testChildPathTwo", "testChildDataTwo".getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE,CreateMode.PERSISTENT);
        System.out.println(new String(zk.getData("/testRootPath/testChildPathTwo",true,null)));
        // 删除子目录节点
        zk.delete("/testRootPath/testChildPathTwo",-1);
        zk.delete("/testRootPath/testChildPathOne",-1);
        // 删除父目录节点
        zk.delete("/testRootPath",-1);*/
        // 关闭连接
        zk.close();



    }
}

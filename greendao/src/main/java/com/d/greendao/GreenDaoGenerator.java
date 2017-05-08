package com.d.greendao;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * GreenDaoGenerator
 * Created by D on 2017/4/27.
 */
public class GreenDaoGenerator {
    public static void main(String[] args) throws Exception {
        // 正如你所见的，你创建了一个用于添加实体（Entity）的模式（Schema）对象。
        // 两个参数分别代表：数据库版本号与自动生成代码的包路径。
        Schema schema = new Schema(1, "com.d.dmusic.module.greendao.music");
        //当然，如果你愿意，你也可以分别指定生成的 Bean 与 DAO 类所在的目录，只要如下所示:
        //Schema schema = new Schema(1, "com.d.dmusic.module.greendao.music.bean");
        //schema.setDefaultJavaPackageDao("com.d.dmusic.module.greendao.music.dao");

        // 模式（Schema）同时也拥有两个默认的 flags，分别用来标示 entity 是否是 activie 以及是否使用 keep sections。
        // schema2.enableActiveEntitiesByDefault();
        // schema2.enableKeepSectionsByDefault();

        // 一旦你拥有了一个 Schema 对象后，你便可以使用它添加实体（Entities）了。
        addMusic(schema);
        addLocalAllMusic(schema);
        addCollectionMusic(schema);
        addCustomList(schema);
        addCustomMusics(schema);

        // 最后我们将使用 DAOGenerator 类的 generateAll() 方法自动生成代码，此处你需要根据自己的情况更改输出目录。
        // 其实，输出目录的路径可以在 build.gradle 中设置，有兴趣的朋友可以自行搜索，这里就不再详解。
        new DaoGenerator().generateAll(schema, "D:\\AndroidStudioProjects\\DMusic\\app\\src\\main\\java");//重新运行GreenDaoGenerator时，将此路径更改为本地src路径
    }

    /**
     * Music-歌曲
     */
    private static void addMusic(Schema schema) {
        Entity entity = schema.addEntity("Music");//表名
        addProperty(entity);
    }

    /**
     * LocalAllMusic-本地歌曲
     */
    private static void addLocalAllMusic(Schema schema) {
        Entity entity = schema.addEntity("LocalAllMusic");//表名
        addProperty(entity);
    }

    /**
     * CollectionMusic-收藏歌曲
     */
    private static void addCollectionMusic(Schema schema) {
        Entity entity = schema.addEntity("CollectionMusic");//表名
        addProperty(entity);
    }

    /**
     * CustomList-自定义列表
     */
    private static void addCustomList(Schema schema) {
        Entity entity = schema.addEntity("CustomList");//表名

        entity.addIdProperty().autoincrement();//id主键自增
        entity.addStringProperty("listName");//歌曲列表名
        entity.addLongProperty("songCount");//包含歌曲数
        entity.addIntProperty("seq");//排序显示序号
        entity.addIntProperty("sortBy");//排序方式(1：按名称排序，2：按时间排序，3：自定义排序)
        entity.addIntProperty("pointer");//指针:指向数据库相应表
    }

    /**
     * CustomMusic-自定义歌曲(创建20张)
     */
    private static void addCustomMusics(Schema schema) {
        for (int i = 0; i < 20; i++) {
            Entity entity = schema.addEntity("CustomMusic" + i);//表名
            addProperty(entity);
        }
    }

    /**
     * 添加通用字段
     *
     * @param entity:entity
     */
    private static void addProperty(Entity entity) {
        entity.addStringProperty("url").primaryKey();//文件完整路径---主键

        entity.addStringProperty("songName");//歌曲名
        entity.addStringProperty("singer");//歌手名
        entity.addStringProperty("album");//专辑

        entity.addLongProperty("duration");//歌曲时长
        entity.addLongProperty("size");//文件大小

        entity.addStringProperty("filePostfix");//文件后缀类型
        entity.addStringProperty("folder");//父文件夹绝对路径
        entity.addStringProperty("lrcName");//歌词名称
        entity.addStringProperty("lrcUrl");//歌词路径

        entity.addBooleanProperty("isCollected");//是否收藏

        entity.addIntProperty("seq");//自定义序号

        entity.addLongProperty("timeStamp");//时间戳，插入时间
    }
}

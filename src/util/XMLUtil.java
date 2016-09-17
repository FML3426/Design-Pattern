package util;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by steven.zmj on 2016/7/7.
 */
public class XMLUtil {

    public static <T> Class<T> readClass(Class<T> clazz, String tagName) {
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("config.xml"));

            //获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("root");
            nl = nl.item(0).getChildNodes();
            String cName = "";
            for (int i = 0; i < nl.getLength(); i++) {
                if (nl.item(i).getNodeName().equals(tagName)) {
                    cName = nl.item(i).getChildNodes().item(0).getNodeValue();
                    break;
                }
            }
            //通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

package cn.smilehelo.studyser.Test;

import java.util.*;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-28 00:10
 **/
public class TreeTest {

    public static void main(String[] args) {
        AreaVo test0 = new AreaVo("A", "a", "1");
        AreaVo test1 = new AreaVo("A", "a", "2");
        AreaVo test2 = new AreaVo("A", "a", "3");
        AreaVo test3 = new AreaVo("A", "b", "1");
        AreaVo test4 = new AreaVo("B", "c", "1");
        AreaVo test5 = new AreaVo("B", "d", "1");
        AreaVo test6 = new AreaVo("B", "d", "2");
        AreaVo test7 = new AreaVo("C", "e", "1");
        AreaVo test8 = new AreaVo("C", "e", "2");
        AreaVo test9 = new AreaVo("C", "f", "1");
        List<AreaVo> all = new ArrayList<>();
        all.add(test0);
        all.add(test1);
        all.add(test2);
        all.add(test3);
        all.add(test4);
        all.add(test5);
        all.add(test6);
        all.add(test7);
        all.add(test8);
        all.add(test9);
        List<AreaVo> result = new ArrayList<>();
        Map<String, Set<String>> shengs = new HashMap<>();
        Map<String, List<AreaVo>> shis = new HashMap<>();
        for (AreaVo areaVo : all) {
            String sheng = areaVo.getSheng();
            String shi = areaVo.getShi();
            if (shengs.get(sheng) == null) {
                Set<String> set = new HashSet<>();
                set.add(shi);
                shengs.put(sheng,set);
            } else {
                shengs.get(sheng).add(shi);
            }
            if (shis.get(shi) == null) {
                List<AreaVo> list = new ArrayList<>();
                list.add(areaVo);
                shis.put(shi, list);
            } else {
                shis.get(shi).add(areaVo);
            }
        }
        for(Map.Entry<String,Set<String>> entry : shengs.entrySet()){
            AreaVo areaVo = new AreaVo();
            areaVo.setSheng(entry.getKey());
            AreaVo one;
            for(String shi: entry.getValue()){
                List<AreaVo> qus = shis.get(shi);
                one = new AreaVo();
                one.setShi(shi);
                one.setVo(qus);
                if(areaVo.getVo() == null){
                    List ll = new ArrayList();
                    ll.add(one);
                    areaVo.setVo(ll);
                }else{
                    areaVo.getVo().add(one);
                }
            }
            result.add(areaVo);
        }
        System.out.println(result);



    }
}

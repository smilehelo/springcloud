package cn.smilehelo.studyser.Test;

import java.util.List;

/**
 * @program: springcloud
 * @description:
 * @author: HeLO
 * @create: 2019-05-28 00:08
 **/
public class AreaVo {

    private String sheng;

    private String shi;

    private String qu;

    private List<AreaVo> vo;

    public AreaVo() {};

    public AreaVo(String sheng, String shi, String qu) {
        this.sheng = sheng;
        this.shi = shi;
        this.qu = qu;
    }

    public String getSheng() {
        return sheng;
    }

    public void setSheng(String sheng) {
        this.sheng = sheng;
    }

    public String getShi() {
        return shi;
    }

    public void setShi(String shi) {
        this.shi = shi;
    }

    public String getQu() {
        return qu;
    }

    public void setQu(String qu) {
        this.qu = qu;
    }

    public List<AreaVo> getVo() {
        return vo;
    }

    public void setVo(List<AreaVo> vo) {
        this.vo = vo;
    }


    @Override
    public String toString() {
        return "AreaVo{" +
                "sheng='" + sheng + '\'' +
                ", shi='" + shi + '\'' +
                ", qu='" + qu + '\'' +
                ", vo=" + vo +
                '}';
    }
}

package ex17;


public interface Tanque {
    String criarTanque();
    void setCorTanque(CoresRGB cor);
    CoresRGB getCorTanque();
    CoresRGB getCorCanhao();
    void setCorCanhao(CoresRGB cor);
    void setX(double x);
    void setY(double y);
    double getX();
    double getY();
    void atirar();
}

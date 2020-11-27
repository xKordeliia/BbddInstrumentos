package Modelo;
import javax.persistence.*;
@Entity
@Table (name="instrumentos")
public class Instrumentos {
	@Id
	@Column (name="idpedido")
	private int vidpedido;
	@Column (name="numSerieInst")
	private String vnumSerieInst;
	@Column (name="nInst")
	private String vnInst;
	@Column (name="peso")
	private String vpeso;
	@Column (name="fechaRecep")
	private String vfechaRecep;
	@Column (name="transportista")
	private String vtransportista;
	@Column (name="observaciones")
	private String vobservaciones;
	public Instrumentos(String vnumSerieInst, String vnInst, String vpeso, String vfechaRecep, String vtransportista,
			String vobservaciones) {
		this.vnumSerieInst = vnumSerieInst;
		this.vnInst = vnInst;
		this.vpeso = vpeso;
		this.vfechaRecep = vfechaRecep;
		this.vtransportista = vtransportista;
		this.vobservaciones = vobservaciones;
	}
	public Instrumentos() {
	}
	@Override
	public String toString() {
		return "Instrumentos [vidpedido=" + vidpedido + ", vnumSerieInst=" + vnumSerieInst + ", vnInst=" + vnInst
				+ ", vpeso=" + vpeso + ", vfechaRecep=" + vfechaRecep + ", vtransportista=" + vtransportista
				+ ", vobservaciones=" + vobservaciones + "]";
	}
	public int getVidpedido() {
		return vidpedido;
	}
	public void setVidpedido(int vidpedido) {
		this.vidpedido = vidpedido;
	}
	public String getVnumSerieInst() {
		return vnumSerieInst;
	}
	public void setVnumSerieInst(String vnumSerieInst) {
		this.vnumSerieInst = vnumSerieInst;
	}
	public String getVnInst() {
		return vnInst;
	}
	public void setVnInst(String vnInst) {
		this.vnInst = vnInst;
	}
	public String getVpeso() {
		return vpeso;
	}
	public void setVpeso(String vpeso) {
		this.vpeso = vpeso;
	}
	public String getVfechaRecep() {
		return vfechaRecep;
	}
	public void setVfechaRecep(String vfechaRecep) {
		this.vfechaRecep = vfechaRecep;
	}

	public String getVtransportista() {
		return vtransportista;
	}
	public void setVtransportista(String vtransportista) {
		this.vtransportista = vtransportista;
	}
	public String getVobservaciones() {
		return vobservaciones;
	}
	public void setVobservaciones(String vobservaciones) {
		this.vobservaciones = vobservaciones;
	}
}

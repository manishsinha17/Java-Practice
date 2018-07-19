package ds.test.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lntinfotech
 */
@Entity
@Table(name = "analysis_master", schema = "dbo")
@XmlRootElement 
@NamedQueries({
    @NamedQuery(name = "AnalysisMaster.findAll", query = "SELECT a FROM AnalysisMaster a")
    , @NamedQuery(name = "AnalysisMaster.findBySrNo", query = "SELECT a FROM AnalysisMaster a WHERE a.srNo = :srNo")
    , @NamedQuery(name = "AnalysisMaster.findByCategories", query = "SELECT a FROM AnalysisMaster a WHERE a.categories = :categories")
    , @NamedQuery(name = "AnalysisMaster.findByUsage", query = "SELECT a FROM AnalysisMaster a WHERE a.usage = :usage")
    , @NamedQuery(name = "AnalysisMaster.findByReceipts", query = "SELECT a FROM AnalysisMaster a WHERE a.receipts = :receipts")
    , @NamedQuery(name = "AnalysisMaster.findByStocktransferout", query = "SELECT a FROM AnalysisMaster a WHERE a.stocktransferout = :stocktransferout")
    , @NamedQuery(name = "AnalysisMaster.findByStocktransferin", query = "SELECT a FROM AnalysisMaster a WHERE a.stocktransferin = :stocktransferin")
    , @NamedQuery(name = "AnalysisMaster.findByInventory", query = "SELECT a FROM AnalysisMaster a WHERE a.inventory = :inventory")
    , @NamedQuery(name = "AnalysisMaster.findByCoverage", query = "SELECT a FROM AnalysisMaster a WHERE a.coverage = :coverage")
    , @NamedQuery(name = "AnalysisMaster.findByExistingInventory", query = "SELECT a FROM AnalysisMaster a WHERE a.existingInventory = :existingInventory")
    , @NamedQuery(name = "AnalysisMaster.findByCreateDateTime", query = "SELECT a FROM AnalysisMaster a WHERE a.createDateTime = :createDateTime")})
public class AnalysisMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "sr_no", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "analysis_master_seq")
	@SequenceGenerator(name = "analysis_master_seq", sequenceName = "analysis_master_seq")
    private Long srNo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "categories", nullable = false, length = 2147483647)
    private String categories;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usage", nullable = false, length = 2147483647)
    private String usage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "receipts", nullable = false, length = 2147483647)
    private String receipts;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Stock_transfer_out", nullable = false, length = 2147483647)
    private String stocktransferout;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "Stock_transfer_in", nullable = false, length = 2147483647)
    private String stocktransferin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "inventory", nullable = false, length = 2147483647)
    private String inventory;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "coverage", nullable = false, length = 2147483647)
    private String coverage;
    @Size(max = 2147483647)
    @Column(name = "existing_inventory", length = 2147483647)
    private String existingInventory;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_date_time", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    public AnalysisMaster() {
    }

    public AnalysisMaster(Long srNo) {
        this.srNo = srNo;
    }

    public AnalysisMaster(Long srNo, String categories, String usage, String receipts, String stocktransferout, String stocktransferin, String inventory, String coverage, Date createDateTime) {
        this.srNo = srNo;
        this.categories = categories;
        this.usage = usage;
        this.receipts = receipts;
        this.stocktransferout = stocktransferout;
        this.stocktransferin = stocktransferin;
        this.inventory = inventory;
        this.coverage = coverage;
        this.createDateTime = createDateTime;
    }

    public Long getSrNo() {
        return srNo;
    }

    public void setSrNo(Long srNo) {
        this.srNo = srNo;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getReceipts() {
        return receipts;
    }

    public void setReceipts(String receipts) {
        this.receipts = receipts;
    }

    public String getStocktransferout() {
        return stocktransferout;
    }

    public void setStocktransferout(String stocktransferout) {
        this.stocktransferout = stocktransferout;
    }

    public String getStocktransferin() {
        return stocktransferin;
    }

    public void setStocktransferin(String stocktransferin) {
        this.stocktransferin = stocktransferin;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public String getExistingInventory() {
        return existingInventory;
    }

    public void setExistingInventory(String existingInventory) {
        this.existingInventory = existingInventory;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srNo != null ? srNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnalysisMaster)) {
            return false;
        }
        AnalysisMaster other = (AnalysisMaster) object;
        if ((this.srNo == null && other.srNo != null) || (this.srNo != null && !this.srNo.equals(other.srNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lti.blockchain.model.AnalysisMaster[ srNo=" + srNo + " ]";
    }
    
}

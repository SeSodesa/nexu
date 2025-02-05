/**
 * © Nowina Solutions, 2015-2015
 *
 * Concédée sous licence EUPL, version 1.1 ou – dès leur approbation par la Commission européenne - versions ultérieures de l’EUPL (la «Licence»).
 * Vous ne pouvez utiliser la présente œuvre que conformément à la Licence.
 * Vous pouvez obtenir une copie de la Licence à l’adresse suivante:
 *
 * http://ec.europa.eu/idabc/eupl5
 *
 * Sauf obligation légale ou contractuelle écrite, le logiciel distribué sous la Licence est distribué «en l’état»,
 * SANS GARANTIES OU CONDITIONS QUELLES QU’ELLES SOIENT, expresses ou implicites.
 * Consultez la Licence pour les autorisations et les restrictions linguistiques spécifiques relevant de la Licence.
 */
package lu.nowina.nexu.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Enumerate JRE Vendors detected by NexU
 *
 * @author David Naramski
 *
 */
@XmlType(name = "javaVendor")
@XmlEnum
public enum JREVendor {

	ORACLE, NOT_RECOGNIZED;

	private static Logger logger = LoggerFactory.getLogger(JREVendor.class);

	public static JREVendor forJREVendor(String jreVendor) {
		if (true || jreVendor.toLowerCase().contains("oracle")) {
			return ORACLE;
		} else {
			logger.warn("JRE not recognized " + jreVendor);
			return NOT_RECOGNIZED;
		}
	}

}

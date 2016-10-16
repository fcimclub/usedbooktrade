package club.fcim.usedbooktrade.dataformatutil;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import club.fcim.usedbooktrade.innerlogic.BookDetail;
import club.fcim.usedbooktrade.mybatis.model.UsedbookNotes;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Singleton mode
 * 
 * @author yuhong.cai@dcfservice.net
 * @date 2015年4月28日 上午9:19:48 update by zho 2016-06-16
 */

@Component
public class MapperFacadeFactory implements FactoryBean<MapperFacade> {

	private static String path = "src/main/resources/third_orika_cfg.xls";

	private static String Dpakage = "net.iqunxing.datacube.global.direct.";
	private static String Jpakage = "net.iqunxing.datacube.global.entity.";
	private static String Mpakage = "net.iqunxing.datacube.mybatis.model.";

	private final MapperFactory mapperFactory;

	public MapperFacadeFactory() {

		mapperFactory = new DefaultMapperFactory.Builder().build();
		// mapperFactory.getConverterFactory().registerConverter("dataconvert",
		// new DateConvert());
		// mapperFactory.getConverterFactory().registerConverter("dataconvertbystring",
		// new DateConvertByString());
		// mapperFactory.getConverterFactory().registerConverter("unionPayDataConvert",
		// new UnionPayDataConvert());
		// mapperFactory.getConverterFactory().registerConverter("stringCntBigDecimal",
		// new StringCntBigDecimal());
		// mapperFactory.getConverterFactory().registerConverter("stringCntBigDecimalWithPercent",
		// new StringCntBigDecimalWithPercent());
		//
		// mapperFactory.getConverterFactory().registerConverter(new
		// LocalDateTimeConverter());

		mapperFactory.classMap(BookDetail.class, UsedbookNotes.class).fieldMap("name", "name")
				.add().fieldMap("grade", "grade").add()
				.fieldMap("school","school").add()
				.fieldMap("contact","contact").add()
				.fieldMap("type","type").add()
				.byDefault().register();
	}

	public MapperFacade getObject() throws Exception {
		return mapperFactory.getMapperFacade();
	}

	public Class<?> getObjectType() {
		return MapperFacade.class;
	}

	public boolean isSingleton() {
		return true;
	}

}
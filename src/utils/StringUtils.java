package utils;

import java.lang.reflect.Field;

import annotations.ToString;

public class StringUtils {
	public static String execToString(Object obj) {
		Class<? extends Object> classe = obj.getClass();
		Field[] fields = classe.getDeclaredFields();
		StringBuilder builder = new StringBuilder();
		for (Field field : fields) {
			if (field.isAnnotationPresent(ToString.class)) {
				ToString annotation = field.getAnnotation(ToString.class);
				field.setAccessible(true);
				try {
					if (annotation.uppercase()) {
						builder.append(field.get(obj).toString().toUpperCase());
					} else {
						builder.append(field.get(obj));
					}
					builder.append(annotation.separator());
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		
		return builder.toString();
	}
}

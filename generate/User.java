package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * null
 * @TableName user
 */
@Data
public class User implements Serializable {
    /**
     * 
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    private Integer id;

    /**
     * 
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    private String name;

    /**
     * 
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated 2021-03-16 20:48:50
     */
    private static final long serialVersionUID = 1L;
}
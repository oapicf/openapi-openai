namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateImageRequest 
{
    public string Prompt { get; set; }
    public CreateImageRequestModel Model { get; set; }
    public int N { get; set; } = 1;
    
    /// <summary>
    /// The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
    /// </summary>
    /// <value>The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.</value>
    public enum QualityEnum
    {
        
        /// <summary>
        /// Enum StandardEnum for standard
        /// </summary>
        StandardEnum = 1,
        
        /// <summary>
        /// Enum HdEnum for hd
        /// </summary>
        HdEnum = 2
    }

    public QualityEnum Quality { get; set; } = QualityEnum.StandardEnum;
    
    /// <summary>
    /// The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
    /// </summary>
    /// <value>The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.</value>
    public enum ResponseFormatEnum
    {
        
        /// <summary>
        /// Enum UrlEnum for url
        /// </summary>
        UrlEnum = 1,
        
        /// <summary>
        /// Enum B64JsonEnum for b64_json
        /// </summary>
        B64JsonEnum = 2
    }

    public ResponseFormatEnum? ResponseFormat { get; set; } = ResponseFormatEnum.UrlEnum;
    
    /// <summary>
    /// The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
    /// </summary>
    /// <value>The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.</value>
    public enum SizeEnum
    {
        
        /// <summary>
        /// Enum _256x256Enum for 256x256
        /// </summary>
        _256x256Enum = 1,
        
        /// <summary>
        /// Enum _512x512Enum for 512x512
        /// </summary>
        _512x512Enum = 2,
        
        /// <summary>
        /// Enum _1024x1024Enum for 1024x1024
        /// </summary>
        _1024x1024Enum = 3,
        
        /// <summary>
        /// Enum _1792x1024Enum for 1792x1024
        /// </summary>
        _1792x1024Enum = 4,
        
        /// <summary>
        /// Enum _1024x1792Enum for 1024x1792
        /// </summary>
        _1024x1792Enum = 5
    }

    public SizeEnum? Size { get; set; } = SizeEnum._1024x1024Enum;
    
    /// <summary>
    /// The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
    /// </summary>
    /// <value>The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.</value>
    public enum StyleEnum
    {
        
        /// <summary>
        /// Enum VividEnum for vivid
        /// </summary>
        VividEnum = 1,
        
        /// <summary>
        /// Enum NaturalEnum for natural
        /// </summary>
        NaturalEnum = 2
    }

    public StyleEnum? Style { get; set; } = StyleEnum.VividEnum;
    public string User { get; set; }
}



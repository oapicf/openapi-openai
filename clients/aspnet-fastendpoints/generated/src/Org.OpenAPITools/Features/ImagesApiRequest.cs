
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateImageRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateImageRequest createImageRequest { get; set; }
}
public class CreateImageEditRequest
{
    /// <summary>
    /// The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
    /// </summary>
    [FastEndpoints.BindFrom("image")]
    public System.IO.Stream Image { get; set; }
    /// <summary>
    /// A text description of the desired image(s). The maximum length is 1000 characters.
    /// </summary>
    [FastEndpoints.BindFrom("prompt")]
    public string Prompt { get; set; }
    /// <summary>
    /// An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
    /// </summary>
    [FastEndpoints.BindFrom("mask")]
    public System.IO.Stream? Mask { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("model")]
    public CreateImageEditRequestModel? Model { get; set; }
    /// <summary>
    /// The number of images to generate. Must be between 1 and 10.
    /// </summary>
    [FastEndpoints.BindFrom("n")]
    public int? N { get; set; }
    /// <summary>
    /// The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
    /// </summary>
    [FastEndpoints.BindFrom("size")]
    public string? Size { get; set; }
    /// <summary>
    /// The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
    /// </summary>
    [FastEndpoints.BindFrom("response_format")]
    public string? ResponseFormat { get; set; }
    /// <summary>
    /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    /// </summary>
    [FastEndpoints.BindFrom("user")]
    public string? User { get; set; }
}
public class CreateImageVariationRequest
{
    /// <summary>
    /// The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
    /// </summary>
    [FastEndpoints.BindFrom("image")]
    public System.IO.Stream Image { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("model")]
    public CreateImageEditRequestModel? Model { get; set; }
    /// <summary>
    /// The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
    /// </summary>
    [FastEndpoints.BindFrom("n")]
    public int? N { get; set; }
    /// <summary>
    /// The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
    /// </summary>
    [FastEndpoints.BindFrom("response_format")]
    public string? ResponseFormat { get; set; }
    /// <summary>
    /// The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
    /// </summary>
    [FastEndpoints.BindFrom("size")]
    public string? Size { get; set; }
    /// <summary>
    /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    /// </summary>
    [FastEndpoints.BindFrom("user")]
    public string? User { get; set; }
}



using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Creates an image given a prompt.
/// </summary>

public class CreateImageEndpoint : FastEndpoints.Endpoint<CreateImageRequest, ImagesResponse>
{
    public override void Configure()
    {
        Post("/v1/images/generations");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Images");
        });

        Summary(s => {
            s.Summary = "Creates an image given a prompt.";
            s.RequestParam(r => r.createImageRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateImageRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Creates an edited or extended image given an original image and a prompt.
/// </summary>

public class CreateImageEditEndpoint : FastEndpoints.Endpoint<CreateImageEditRequest, ImagesResponse>
{
    public override void Configure()
    {
        Post("/v1/images/edits");
        
        
        AllowAnonymous();
        AllowFileUploads();AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Images");
        });

        Summary(s => {
            s.Summary = "Creates an edited or extended image given an original image and a prompt.";
            s.RequestParam(r => r.Image, "The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.");
            s.RequestParam(r => r.Prompt, "A text description of the desired image(s). The maximum length is 1000 characters.");
            s.RequestParam(r => r.Mask, "An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.");
            s.RequestParam(r => r.Model, "");
            s.RequestParam(r => r.N, "The number of images to generate. Must be between 1 and 10.");
            s.RequestParam(r => r.Size, "The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.");
            s.RequestParam(r => r.ResponseFormat, "The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.");
            s.RequestParam(r => r.User, "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateImageEditRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Creates a variation of a given image.
/// </summary>

public class CreateImageVariationEndpoint : FastEndpoints.Endpoint<CreateImageVariationRequest, ImagesResponse>
{
    public override void Configure()
    {
        Post("/v1/images/variations");
        
        
        AllowAnonymous();
        AllowFileUploads();
        Description(x =>
        {
            x.WithTags("Images");
        });

        Summary(s => {
            s.Summary = "Creates a variation of a given image.";
            s.RequestParam(r => r.Image, "The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.");
            s.RequestParam(r => r.Model, "");
            s.RequestParam(r => r.N, "The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.");
            s.RequestParam(r => r.ResponseFormat, "The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.");
            s.RequestParam(r => r.Size, "The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.");
            s.RequestParam(r => r.User, "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateImageVariationRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


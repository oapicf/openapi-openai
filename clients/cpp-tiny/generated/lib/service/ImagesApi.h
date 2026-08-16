#ifndef TINY_CPP_CLIENT_ImagesApi_H_
#define TINY_CPP_CLIENT_ImagesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CreateImageEditRequest_model.h"
#include "CreateImageRequest.h"
#include "ImagesResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ImagesApi : public Service {
public:
    ImagesApi() = default;

    virtual ~ImagesApi() = default;

    /**
    * Creates an image given a prompt..
    *
    * 
    * \param createImageRequest  *Required*
    */
    Response<
                ImagesResponse
        >
    createImage(
            
            CreateImageRequest createImageRequest
            
    );
    /**
    * Creates an edited or extended image given an original image and a prompt..
    *
    * 
    * \param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. *Required*
    * \param prompt A text description of the desired image(s). The maximum length is 1000 characters. *Required*
    * \param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
    * \param model 
    * \param n The number of images to generate. Must be between 1 and 10.
    * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
    * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
    * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    */
    Response<
                ImagesResponse
        >
    createImageEdit(
            
            std::string image
            , 
            
            std::string prompt
            , 
            
            std::string mask
            , 
            
            CreateImageEditRequest_model model
            , 
            
            int n
            , 
            
            std::string size
            , 
            
            std::string responseFormat
            , 
            
            std::string user
            
    );
    /**
    * Creates a variation of a given image..
    *
    * 
    * \param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. *Required*
    * \param model 
    * \param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
    * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
    * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
    * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
    */
    Response<
                ImagesResponse
        >
    createImageVariation(
            
            std::string image
            , 
            
            CreateImageEditRequest_model model
            , 
            
            int n
            , 
            
            std::string responseFormat
            , 
            
            std::string size
            , 
            
            std::string user
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ImagesApi_H_ */
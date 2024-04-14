#ifndef _ImagesManager_H_
#define _ImagesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CreateImageEditRequest_model.h"
#include "CreateImageRequest.h"
#include "ImagesResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Images Images
 * \ingroup Operations
 *  @{
 */
class ImagesManager {
public:
	ImagesManager();
	virtual ~ImagesManager();

/*! \brief Creates an image given a prompt.. *Synchronous*
 *
 * 
 * \param createImageRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageSync(char * accessToken,
	std::shared_ptr<CreateImageRequest> createImageRequest, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);

/*! \brief Creates an image given a prompt.. *Asynchronous*
 *
 * 
 * \param createImageRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageAsync(char * accessToken,
	std::shared_ptr<CreateImageRequest> createImageRequest, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);


/*! \brief Creates an edited or extended image given an original image and a prompt.. *Synchronous*
 *
 * 
 * \param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. *Required*
 * \param prompt A text description of the desired image(s). The maximum length is 1000 characters. *Required*
 * \param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
 * \param model 
 * \param n The number of images to generate. Must be between 1 and 10.
 * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
 * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageEditSync(char * accessToken,
	std::string image, std::string prompt, std::string mask, CreateImageEditRequest_model model, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);

/*! \brief Creates an edited or extended image given an original image and a prompt.. *Asynchronous*
 *
 * 
 * \param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. *Required*
 * \param prompt A text description of the desired image(s). The maximum length is 1000 characters. *Required*
 * \param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
 * \param model 
 * \param n The number of images to generate. Must be between 1 and 10.
 * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
 * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageEditAsync(char * accessToken,
	std::string image, std::string prompt, std::string mask, CreateImageEditRequest_model model, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);


/*! \brief Creates a variation of a given image.. *Synchronous*
 *
 * 
 * \param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. *Required*
 * \param model 
 * \param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
 * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
 * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageVariationSync(char * accessToken,
	std::string image, CreateImageEditRequest_model model, int n, std::string responseFormat, std::string size, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);

/*! \brief Creates a variation of a given image.. *Asynchronous*
 *
 * 
 * \param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. *Required*
 * \param model 
 * \param n The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
 * \param responseFormat The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
 * \param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * \param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool createImageVariationAsync(char * accessToken,
	std::string image, CreateImageEditRequest_model model, int n, std::string responseFormat, std::string size, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.openai.com/v1";
	}
};
/** @}*/

}
}
#endif /* ImagesManager_H_ */

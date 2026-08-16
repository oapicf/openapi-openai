
/*
 * CreateModerationRequest_input_oneOf_inner_oneOf_image_url.h
 *
 * Contains either an image URL or a data URL for a base64 encoded image.
 */

#ifndef TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_oneOf_image_url_H_
#define TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_oneOf_image_url_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Contains either an image URL or a data URL for a base64 encoded image.
 *
 *  \ingroup Models
 *
 */

class CreateModerationRequest_input_oneOf_inner_oneOf_image_url{
public:

    /*! \brief Constructor.
	 */
    CreateModerationRequest_input_oneOf_inner_oneOf_image_url();
    CreateModerationRequest_input_oneOf_inner_oneOf_image_url(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateModerationRequest_input_oneOf_inner_oneOf_image_url();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Either a URL of the image or the base64 encoded image data.
	 */
	std::string getUrl();

	/*! \brief Set Either a URL of the image or the base64 encoded image data.
	 */
	void setUrl(std::string  url);


    private:
    std::string url{};
};
}

#endif /* TINY_CPP_CLIENT_CreateModerationRequest_input_oneOf_inner_oneOf_image_url_H_ */

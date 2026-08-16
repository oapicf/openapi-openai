
/*
 * MessageContentImageUrlObject_image_url.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessageContentImageUrlObject_image_url_H_
#define TINY_CPP_CLIENT_MessageContentImageUrlObject_image_url_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageContentImageUrlObject_image_url{
public:

    /*! \brief Constructor.
	 */
    MessageContentImageUrlObject_image_url();
    MessageContentImageUrlObject_image_url(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageContentImageUrlObject_image_url();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
	 */
	std::string getUrl();

	/*! \brief Set The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
	 */
	void setUrl(std::string  url);
	/*! \brief Get Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
	 */
	std::string getDetail();

	/*! \brief Set Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
	 */
	void setDetail(std::string  detail);


    private:
    std::string url{};
    std::string detail{};
};
}

#endif /* TINY_CPP_CLIENT_MessageContentImageUrlObject_image_url_H_ */

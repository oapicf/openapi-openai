
/*
 * MessageContentImageUrlObject.h
 *
 * References an image URL in the content of a message.
 */

#ifndef TINY_CPP_CLIENT_MessageContentImageUrlObject_H_
#define TINY_CPP_CLIENT_MessageContentImageUrlObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageContentImageUrlObject_image_url.h"

namespace Tiny {


/*! \brief References an image URL in the content of a message.
 *
 *  \ingroup Models
 *
 */

class MessageContentImageUrlObject{
public:

    /*! \brief Constructor.
	 */
    MessageContentImageUrlObject();
    MessageContentImageUrlObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageContentImageUrlObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the content part.
	 */
	std::string getType();

	/*! \brief Set The type of the content part.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageContentImageUrlObject_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(MessageContentImageUrlObject_image_url  image_url);


    private:
    std::string type{};
    MessageContentImageUrlObject_image_url image_url;
};
}

#endif /* TINY_CPP_CLIENT_MessageContentImageUrlObject_H_ */

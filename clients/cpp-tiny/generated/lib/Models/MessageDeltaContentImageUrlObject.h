
/*
 * MessageDeltaContentImageUrlObject.h
 *
 * References an image URL in the content of a message.
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaContentImageUrlObject_H_
#define TINY_CPP_CLIENT_MessageDeltaContentImageUrlObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageDeltaContentImageUrlObject_image_url.h"

namespace Tiny {


/*! \brief References an image URL in the content of a message.
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentImageUrlObject{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaContentImageUrlObject();
    MessageDeltaContentImageUrlObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaContentImageUrlObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the content part in the message.
	 */
	int getIndex();

	/*! \brief Set The index of the content part in the message.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `image_url`.
	 */
	std::string getType();

	/*! \brief Set Always `image_url`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageDeltaContentImageUrlObject_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(MessageDeltaContentImageUrlObject_image_url  image_url);


    private:
    int index{};
    std::string type{};
    MessageDeltaContentImageUrlObject_image_url image_url;
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaContentImageUrlObject_H_ */

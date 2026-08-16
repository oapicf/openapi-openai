
/*
 * MessageDeltaContentImageFileObject.h
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaContentImageFileObject_H_
#define TINY_CPP_CLIENT_MessageDeltaContentImageFileObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageDeltaContentImageFileObject_image_file.h"

namespace Tiny {


/*! \brief References an image [File](/docs/api-reference/files) in the content of a message.
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentImageFileObject{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaContentImageFileObject();
    MessageDeltaContentImageFileObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaContentImageFileObject();


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
	/*! \brief Get Always `image_file`.
	 */
	std::string getType();

	/*! \brief Set Always `image_file`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageDeltaContentImageFileObject_image_file getImageFile();

	/*! \brief Set 
	 */
	void setImageFile(MessageDeltaContentImageFileObject_image_file  image_file);


    private:
    int index{};
    std::string type{};
    MessageDeltaContentImageFileObject_image_file image_file;
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaContentImageFileObject_H_ */

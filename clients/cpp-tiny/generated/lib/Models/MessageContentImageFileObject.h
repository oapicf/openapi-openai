
/*
 * MessageContentImageFileObject.h
 *
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */

#ifndef TINY_CPP_CLIENT_MessageContentImageFileObject_H_
#define TINY_CPP_CLIENT_MessageContentImageFileObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageContentImageFileObject_image_file.h"

namespace Tiny {


/*! \brief References an image [File](/docs/api-reference/files) in the content of a message.
 *
 *  \ingroup Models
 *
 */

class MessageContentImageFileObject{
public:

    /*! \brief Constructor.
	 */
    MessageContentImageFileObject();
    MessageContentImageFileObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageContentImageFileObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `image_file`.
	 */
	std::string getType();

	/*! \brief Set Always `image_file`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageContentImageFileObject_image_file getImageFile();

	/*! \brief Set 
	 */
	void setImageFile(MessageContentImageFileObject_image_file  image_file);


    private:
    std::string type{};
    MessageContentImageFileObject_image_file image_file;
};
}

#endif /* TINY_CPP_CLIENT_MessageContentImageFileObject_H_ */

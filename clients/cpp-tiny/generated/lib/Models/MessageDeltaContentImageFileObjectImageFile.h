
/*
 * MessageDeltaContentImageFileObject_image_file.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaContentImageFileObject_image_file_H_
#define TINY_CPP_CLIENT_MessageDeltaContentImageFileObject_image_file_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentImageFileObject_image_file{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaContentImageFileObject_image_file();
    MessageDeltaContentImageFileObject_image_file(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaContentImageFileObject_image_file();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
	 */
	std::string getFileId();

	/*! \brief Set The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
	 */
	void setFileId(std::string  file_id);
	/*! \brief Get Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
	 */
	std::string getDetail();

	/*! \brief Set Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
	 */
	void setDetail(std::string  detail);


    private:
    std::string file_id{};
    std::string detail{};
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaContentImageFileObject_image_file_H_ */

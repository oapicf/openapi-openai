
/*
 * MessageContentTextAnnotationsFilePathObject_file_path.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessageContentTextAnnotationsFilePathObject_file_path_H_
#define TINY_CPP_CLIENT_MessageContentTextAnnotationsFilePathObject_file_path_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageContentTextAnnotationsFilePathObject_file_path{
public:

    /*! \brief Constructor.
	 */
    MessageContentTextAnnotationsFilePathObject_file_path();
    MessageContentTextAnnotationsFilePathObject_file_path(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageContentTextAnnotationsFilePathObject_file_path();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the file that was generated.
	 */
	std::string getFileId();

	/*! \brief Set The ID of the file that was generated.
	 */
	void setFileId(std::string  file_id);


    private:
    std::string file_id{};
};
}

#endif /* TINY_CPP_CLIENT_MessageContentTextAnnotationsFilePathObject_file_path_H_ */

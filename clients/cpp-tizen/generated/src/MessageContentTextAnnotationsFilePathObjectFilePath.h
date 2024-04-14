/*
 * MessageContentTextAnnotationsFilePathObject_file_path.h
 *
 * 
 */

#ifndef _MessageContentTextAnnotationsFilePathObject_file_path_H_
#define _MessageContentTextAnnotationsFilePathObject_file_path_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageContentTextAnnotationsFilePathObject_file_path : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageContentTextAnnotationsFilePathObject_file_path();
	MessageContentTextAnnotationsFilePathObject_file_path(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageContentTextAnnotationsFilePathObject_file_path();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the file that was generated.
	 */
	std::string getFileId();

	/*! \brief Set The ID of the file that was generated.
	 */
	void setFileId(std::string  file_id);

private:
	std::string file_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageContentTextAnnotationsFilePathObject_file_path_H_ */

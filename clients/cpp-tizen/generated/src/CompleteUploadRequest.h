/*
 * CompleteUploadRequest.h
 *
 * 
 */

#ifndef _CompleteUploadRequest_H_
#define _CompleteUploadRequest_H_


#include <string>
#include <list>
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

class CompleteUploadRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CompleteUploadRequest();
	CompleteUploadRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CompleteUploadRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ordered list of Part IDs. 
	 */
	std::list<std::string> getPartIds();

	/*! \brief Set The ordered list of Part IDs. 
	 */
	void setPartIds(std::list <std::string> part_ids);
	/*! \brief Get The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
	 */
	std::string getMd5();

	/*! \brief Set The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
	 */
	void setMd5(std::string  md5);

private:
	std::list <std::string>part_ids;
	std::string md5;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CompleteUploadRequest_H_ */

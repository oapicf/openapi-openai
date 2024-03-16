/*
 * ListFilesResponse.h
 *
 * 
 */

#ifndef _ListFilesResponse_H_
#define _ListFilesResponse_H_


#include <string>
#include "OpenAIFile.h"
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

class ListFilesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ListFilesResponse();
	ListFilesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ListFilesResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<OpenAIFile> getData();

	/*! \brief Set 
	 */
	void setData(std::list <OpenAIFile> data);

private:
	std::string object;
	std::list <OpenAIFile>data;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ListFilesResponse_H_ */

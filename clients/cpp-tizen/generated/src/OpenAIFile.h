/*
 * OpenAIFile.h
 *
 * 
 */

#ifndef _OpenAIFile_H_
#define _OpenAIFile_H_


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

class OpenAIFile : public Object {
public:
	/*! \brief Constructor.
	 */
	OpenAIFile();
	OpenAIFile(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OpenAIFile();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	int getBytes();

	/*! \brief Set 
	 */
	void setBytes(int  bytes);
	/*! \brief Get 
	 */
	int getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	std::string getFilename();

	/*! \brief Set 
	 */
	void setFilename(std::string  filename);
	/*! \brief Get 
	 */
	std::string getPurpose();

	/*! \brief Set 
	 */
	void setPurpose(std::string  purpose);
	/*! \brief Get 
	 */
	std::string getStatus();

	/*! \brief Set 
	 */
	void setStatus(std::string  status);
	/*! \brief Get 
	 */
	std::string getStatusDetails();

	/*! \brief Set 
	 */
	void setStatusDetails(std::string  status_details);

private:
	std::string id;
	std::string object;
	int bytes;
	int created_at;
	std::string filename;
	std::string purpose;
	std::string status;
	std::string status_details;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OpenAIFile_H_ */

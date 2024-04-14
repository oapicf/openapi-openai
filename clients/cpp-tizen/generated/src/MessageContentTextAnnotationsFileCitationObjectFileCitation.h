/*
 * MessageContentTextAnnotationsFileCitationObject_file_citation.h
 *
 * 
 */

#ifndef _MessageContentTextAnnotationsFileCitationObject_file_citation_H_
#define _MessageContentTextAnnotationsFileCitationObject_file_citation_H_


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

class MessageContentTextAnnotationsFileCitationObject_file_citation : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageContentTextAnnotationsFileCitationObject_file_citation();
	MessageContentTextAnnotationsFileCitationObject_file_citation(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageContentTextAnnotationsFileCitationObject_file_citation();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the specific File the citation is from.
	 */
	std::string getFileId();

	/*! \brief Set The ID of the specific File the citation is from.
	 */
	void setFileId(std::string  file_id);
	/*! \brief Get The specific quote in the file.
	 */
	std::string getQuote();

	/*! \brief Set The specific quote in the file.
	 */
	void setQuote(std::string  quote);

private:
	std::string file_id;
	std::string quote;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageContentTextAnnotationsFileCitationObject_file_citation_H_ */

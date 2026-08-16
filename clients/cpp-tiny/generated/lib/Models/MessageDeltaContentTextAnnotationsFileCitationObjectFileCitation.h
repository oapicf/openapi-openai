
/*
 * MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaContentTextAnnotationsFileCitationObject_file_citation_H_
#define TINY_CPP_CLIENT_MessageDeltaContentTextAnnotationsFileCitationObject_file_citation_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentTextAnnotationsFileCitationObject_file_citation{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaContentTextAnnotationsFileCitationObject_file_citation();
    MessageDeltaContentTextAnnotationsFileCitationObject_file_citation(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaContentTextAnnotationsFileCitationObject_file_citation();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string file_id{};
    std::string quote{};
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaContentTextAnnotationsFileCitationObject_file_citation_H_ */

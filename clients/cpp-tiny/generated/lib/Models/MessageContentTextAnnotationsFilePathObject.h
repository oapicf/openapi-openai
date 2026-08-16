
/*
 * MessageContentTextAnnotationsFilePathObject.h
 *
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 */

#ifndef TINY_CPP_CLIENT_MessageContentTextAnnotationsFilePathObject_H_
#define TINY_CPP_CLIENT_MessageContentTextAnnotationsFilePathObject_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageContentTextAnnotationsFilePathObject_file_path.h"

namespace Tiny {


/*! \brief A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 *
 *  \ingroup Models
 *
 */

class MessageContentTextAnnotationsFilePathObject{
public:

    /*! \brief Constructor.
	 */
    MessageContentTextAnnotationsFilePathObject();
    MessageContentTextAnnotationsFilePathObject(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageContentTextAnnotationsFilePathObject();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `file_path`.
	 */
	std::string getType();

	/*! \brief Set Always `file_path`.
	 */
	void setType(std::string  type);
	/*! \brief Get The text in the message content that needs to be replaced.
	 */
	std::string getText();

	/*! \brief Set The text in the message content that needs to be replaced.
	 */
	void setText(std::string  text);
	/*! \brief Get 
	 */
	MessageContentTextAnnotationsFilePathObject_file_path getFilePath();

	/*! \brief Set 
	 */
	void setFilePath(MessageContentTextAnnotationsFilePathObject_file_path  file_path);
	/*! \brief Get 
	 */
	int getStartIndex();

	/*! \brief Set 
	 */
	void setStartIndex(int  start_index);
	/*! \brief Get 
	 */
	int getEndIndex();

	/*! \brief Set 
	 */
	void setEndIndex(int  end_index);


    private:
    std::string type{};
    std::string text{};
    MessageContentTextAnnotationsFilePathObject_file_path file_path;
    int start_index{};
    int end_index{};
};
}

#endif /* TINY_CPP_CLIENT_MessageContentTextAnnotationsFilePathObject_H_ */

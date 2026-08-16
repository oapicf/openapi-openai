
/*
 * CreateMessageRequest_attachments_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CreateMessageRequest_attachments_inner_H_
#define TINY_CPP_CLIENT_CreateMessageRequest_attachments_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreateMessageRequest_attachments_inner_tools_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateMessageRequest_attachments_inner{
public:

    /*! \brief Constructor.
	 */
    CreateMessageRequest_attachments_inner();
    CreateMessageRequest_attachments_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateMessageRequest_attachments_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the file to attach to the message.
	 */
	std::string getFileId();

	/*! \brief Set The ID of the file to attach to the message.
	 */
	void setFileId(std::string  file_id);
	/*! \brief Get The tools to add this file to.
	 */
	std::list<CreateMessageRequest_attachments_inner_tools_inner> getTools();

	/*! \brief Set The tools to add this file to.
	 */
	void setTools(std::list <CreateMessageRequest_attachments_inner_tools_inner> tools);


    private:
    std::string file_id{};
    std::list<CreateMessageRequest_attachments_inner_tools_inner> tools;
};
}

#endif /* TINY_CPP_CLIENT_CreateMessageRequest_attachments_inner_H_ */

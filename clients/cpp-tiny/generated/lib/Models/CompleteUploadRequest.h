
/*
 * CompleteUploadRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CompleteUploadRequest_H_
#define TINY_CPP_CLIENT_CompleteUploadRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CompleteUploadRequest{
public:

    /*! \brief Constructor.
	 */
    CompleteUploadRequest();
    CompleteUploadRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CompleteUploadRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<std::string> part_ids;
    std::string md5{};
};
}

#endif /* TINY_CPP_CLIENT_CompleteUploadRequest_H_ */

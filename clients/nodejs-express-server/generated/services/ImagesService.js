/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Creates an image given a prompt.
*
* createImageRequest CreateImageRequest 
* returns ImagesResponse
* */
const createImage = ({ createImageRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createImageRequest,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates an edited or extended image given an original image and a prompt.
*
* image File The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
* prompt String A text description of the desired image(s). The maximum length is 1000 characters.
* mask File An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`. (optional)
* model CreateImageEditRequest_model  (optional)
* n Integer The number of images to generate. Must be between 1 and 10. (optional)
* size String The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
* responseUnderscoreformat String The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional)
* user String A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)
* returns ImagesResponse
* */
const createImageEdit = ({ image, prompt, mask, model, n, size, responseUnderscoreformat, user }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        image,
        prompt,
        mask,
        model,
        n,
        size,
        responseUnderscoreformat,
        user,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Creates a variation of a given image.
*
* image File The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
* model CreateImageEditRequest_model  (optional)
* n Integer The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported. (optional)
* responseUnderscoreformat String The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated. (optional)
* size String The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. (optional)
* user String A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids).  (optional)
* returns ImagesResponse
* */
const createImageVariation = ({ image, model, n, responseUnderscoreformat, size, user }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        image,
        model,
        n,
        responseUnderscoreformat,
        size,
        user,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  createImage,
  createImageEdit,
  createImageVariation,
};
